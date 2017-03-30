package unit;

import function.*;
import observer.UnitData;
import observer.UnitDisplay;
import behavior.movement.*;
import behavior.weapon.*;
import behavior.attack.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;




public class Unit extends Observable{
	static final int CITIZEN = 0;
	static final int KNIGHT = 1;
	static final int MAGE = 2;
	
	private UnitData unitData = new UnitData();
	private UnitDisplay unitDisplay = new UnitDisplay(unitData);
	
	private static Unit uniqueInstance;
	private ArrayList<Unit> unitList = new ArrayList<Unit>();
	private ArrayList<Unit> detectList = new ArrayList<Unit>();
	
	AttackBehavior attack = null;
	MovementBehavior movement = null;
	WeaponBehavior weapon=null;
	
	String type = "";
	int locationX=0, locationY=0;
	int health=0;
	int movementSpeed=0;
	int[] unitCount = {1,1,1};
	
	
	private Unit() {}

	//for Citizen,Knight,Mage
	private Unit(AttackBehavior attack, MovementBehavior movement, WeaponBehavior weapon,
			String type, int locationX, int locationY, int health) {
		super();
		this.attack = attack;
		this.movement = movement;
		this.weapon = weapon;
		this.type = type;
		this.locationX = locationX;
		this.locationY = locationY;
		this.health = health;
	}
	
	//for Owl
	private Unit(AttackBehavior attack, MovementBehavior movement, WeaponBehavior weapon,
			String type, int locationX, int locationY, ArrayList<Unit> unit) {
		super();
		this.attack = attack;
		this.movement = movement;
		this.weapon = weapon;
		this.type = type;
		this.locationX = locationX;
		this.locationY = locationY;
		this.detectList = unit;
	}


	public static synchronized Unit getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Unit();
		}
		return uniqueInstance;
	}
	

	public void addUnit(String type){
		Unit tempUnit=null;
		if(type.equals("Citizen")){ 
			tempUnit=new Unit(new Punch(), new Walk(), new Fist(),
					"Citizen"+unitCount[CITIZEN], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),10);
			unitCount[CITIZEN]+=1;
		}else if(type.equals("Knight")){
			tempUnit=new Unit(new SwingSword(), new Walk(), new Sword(),
					"Knight"+unitCount[KNIGHT], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),30);
			unitCount[KNIGHT]+=1;
		}else if(type.equals("Mage")){
			tempUnit=new Unit(new CastFireball(), new Teleport(), new Staff(),
					"Mage"+unitCount[MAGE], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),20);
			unitCount[MAGE]+=1;
		}else if(type.equals("Owl")){
			tempUnit=new Unit(new CantAttack(), new Fly(), new NoWeapon(),
					"Owl", GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),null);
		}else{
			System.out.println("Error");
		}
		unitList.add(tempUnit);
		System.out.println("---"+tempUnit.type+" 추가 완료---");
//		System.out.println(tempUnit.toString());
		System.out.println();
	}
	
	public void moveDirect(String type, int x, int y){
		Unit tempUnit = new FindUnit().findOneByType(unitList, type);
		if (tempUnit==null){
			System.out.println(type + "이 존재하지 않습니다.");
		}else
			new Move().moveLocation(tempUnit, x, y);
	}
	
	public void addDetect(String type){
		if(type.equals("Owl")){
			System.out.println("올빼미는 등록할 수 없습니다.");
			System.exit(1);
		}
		Unit tempUnit = new FindUnit().findOneByType(unitList, type);
		Unit tempOwl = new FindUnit().findOneByType(unitList, "Owl");
		
		if(tempOwl.detectList == null){
			tempOwl.detectList = new ArrayList<Unit>();
		}
		tempOwl.detectList.add(tempUnit);
		
	}
	
	public void specialAbility(){
		Unit tempOwl = new FindUnit().findOneByType(unitList, "Owl");
		System.out.println("현재 Owl의 위치는: ("+tempOwl.getLocationX()+", "+tempOwl.getLocationY()+")");
		System.out.println("현재 Owl에 등록된 유닛은 아래와 같습니다.");
		for(Unit u:tempOwl.detectList){
			System.out.println(u);
		}
//		unitDisplay = new UnitDisplay(unitData);
		unitData.changed(tempOwl.detectList,tempOwl.getLocationX(),tempOwl.getLocationY(),20);
	}
	
	
	public void removeUnit(String type){
		Iterator<Unit> iterator = unitList.iterator();
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			System.out.println(tempUnit.type + "이 죽었습니다.");
			iterator.remove();
		}
	}
	

	public void unitDied(String type) {
		// TODO Auto-generated method stub
		
		Unit tempOwl = new FindUnit().findOneByType(unitList, "Owl");
		Unit tempUnit = new FindUnit().findOneByType(unitList, type);
		tempOwl.detectList.remove(tempUnit);
		new Died(unitList).diedOne(type);
		System.out.println(tempUnit);
//		
	}
	
	public void unitDiedAll() {
		// TODO Auto-generated method stub
		new Died(unitList).diedAll();
	}
	
	public void fight(Unit tempUnit){
		System.out.print(tempUnit.type + " \t");
		tempUnit.weapon.useWeapon(tempUnit.attack);
		System.out.println();
	}
	public void fightAllUnit() {
		// TODO Auto-generated method stub
		Iterator<Unit> iterator = unitList.iterator();
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			tempUnit.fight(tempUnit);
		}
	}
	
	public void fightOneUnit(String type) {
		// TODO Auto-generated method stub
		Unit tempUnit = new FindUnit().findOneByType(unitList, type);
		tempUnit.fight(tempUnit);
	}
	
	public void printAllUnit(){
		new Print(unitList).printAll();
	}
	
	
	//move()메소드는 Unit공통이기 때문에 Unit 클래스에서 구현
	//Move와 관련된 작업은 function패키지내 Move클래스가 작업하도록 지시
	public void move(int x, int y){
		new Move(this, x, y);
	}
	//getter
	
	public String getType(){
		return this.type;
	}
	public int getHealth(){
		return this.health;
	}
	public void getLocation(){
		System.out.println("("+this.locationX+"," + this.locationY+")");
	}
	public int getLocationX(){
		return this.locationX;
	}
	public int getLocationY(){
		return this.locationY;
	}
	public String getWeaponType(){
		return this.weapon.getWeaponType();
	}	
	public String getMovementType() {
		// TODO Auto-generated method stub
		return this.movement.getMovementType();
	}


	public String getAttackType() {
		// TODO Auto-generated method stub
		return this.attack.getAttackType();
	}
	
	public Unit getOwl(){
		return new FindUnit().findOneByType(unitList, "Owl");
	}
	
	public Unit getKnight(){
		return new FindUnit().findOneByType(unitList, "Knight");
	}
	
	
	
	
	public ArrayList<Unit> getUnitList() {
		return unitList;
	}
	
	public AttackBehavior getAttackBehavior() {
		// TODO Auto-generated method stub
		return this.attack;
	}
	public MovementBehavior getMovementBehavior() {
		// TODO Auto-generated method stub
		return this.movement;
	}
	public WeaponBehavior getWeaponBehavior() {
		// TODO Auto-generated method stub
		return this.weapon;
	}

	public void setUnitList(ArrayList<Unit> unitList) {
		this.unitList = unitList;
	}

	//setter
	public void setWeapon(WeaponBehavior w){
		System.out.println("[Before Weapon]: " + this.getWeaponType());
		this.weapon = w;
		System.out.println("[After Weapon]: " + this.getWeaponType());
	}
	public void setMovement(MovementBehavior m){
		this.movement = m;
	}
	public void setAttack(AttackBehavior a){
		this.attack = a;
	}
	
	public void setLocation(int x, int y){
		System.out.println(this.getType() + "\t이동 시작");
		System.out.println("[Before Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		this.locationX = x;
		this.locationY = y;
		System.out.println("[After Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		System.out.println();
	}
	
	
	//toString
	public String toString(){
		return  
				"Type: " + this.type + "\t"+
				"Health: " + this.health + "\t"+
				"Location X,Y: " + this.locationX+","+this.locationY+"\t"+
				"WeaponType: " + this.weapon.getWeaponType() + "\t"+
				"MovementType: " + this.movement.getMovementType() + "\t"+
				"AttackType: " + this.attack.getAttackType() + "\t";
	}


	
	
	
}



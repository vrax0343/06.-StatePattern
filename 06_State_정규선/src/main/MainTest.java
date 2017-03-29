package main;

import unit.*;
import behavior.weapon.*;
import decorator.SuperAttack;
import decorator.SuperMove;
import factory.af.unit.TeamUnit;
import factory.fm.*;
import function.FindUnit;


public class MainTest {
	
	public static void main(String[] args){		
		
		
		
		System.out.println("=======================================================");
		System.out.println("1. 청팀, 적팀, 중립유닛을 종류별로 생성한다.");
		System.out.println("=======================================================");
		
		factory.af.TeamFactoryStore btf = new factory.af.BlueTeamFactory();
		factory.af.TeamFactoryStore rtf = new factory.af.RedTeamFactory();
		factory.af.TeamFactoryStore ntf = new factory.af.NeutralTeamFactory();
		factory.af.unit.TeamUnit bu,ru,nu= null;
		
		factory.af.unit.TeamUnit  num = ntf.makeUnit("Mage");
		factory.af.unit.TeamUnit  nuc = ntf.makeUnit("Civilian");
		factory.af.unit.TeamUnit  nuk = ntf.makeUnit("Knight");
		System.out.println();
		
		factory.af.unit.TeamUnit  bum = btf.makeUnit("Mage");
		factory.af.unit.TeamUnit  buc = btf.makeUnit("Civilian");
		factory.af.unit.TeamUnit  buk = btf.makeUnit("Knight");
		System.out.println();
		
		factory.af.unit.TeamUnit  rum = rtf.makeUnit("Mage");
		factory.af.unit.TeamUnit  ruc = rtf.makeUnit("Civilian");
		factory.af.unit.TeamUnit  ruk = rtf.makeUnit("Knight");
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("2. 청팀의 기사가 각성(공격형) 했다. ");
		System.out.println("=======================================================");
		buk = new SuperAttack(buk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. 청팀의 기사가 공격한다.");
		System.out.println("=======================================================");
		buk.attack();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. 적팀의 기사가 각성(이동형) 했다.");
		System.out.println("=======================================================");
		ruk = new SuperMove(ruk);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 적팀의 기사가 100, 100으로 이동한다.");
		System.out.println("=======================================================");
		ruk.move(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. 중립팀 기사가 각성(공격형, 이동형 모두)했다.");
		System.out.println("=======================================================");
		nuk = new SuperMove(nuk);
		nuk = new SuperAttack(nuk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. 중립팀 기사가 100, 100으로 이동한다.");
		System.out.println("=======================================================");
		nuk.move(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. 중립팀 기사가 공격한다.");
		System.out.println("=======================================================");
		nuk.attack();
		System.out.println();

	
	}
}

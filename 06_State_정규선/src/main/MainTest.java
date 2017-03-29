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
		System.out.println("1. û��, ����, �߸������� �������� �����Ѵ�.");
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
		System.out.println("2. û���� ��簡 ����(������) �ߴ�. ");
		System.out.println("=======================================================");
		buk = new SuperAttack(buk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. û���� ��簡 �����Ѵ�.");
		System.out.println("=======================================================");
		buk.attack();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. ������ ��簡 ����(�̵���) �ߴ�.");
		System.out.println("=======================================================");
		ruk = new SuperMove(ruk);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. ������ ��簡 100, 100���� �̵��Ѵ�.");
		System.out.println("=======================================================");
		ruk.move(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. �߸��� ��簡 ����(������, �̵��� ���)�ߴ�.");
		System.out.println("=======================================================");
		nuk = new SuperMove(nuk);
		nuk = new SuperAttack(nuk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. �߸��� ��簡 100, 100���� �̵��Ѵ�.");
		System.out.println("=======================================================");
		nuk.move(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. �߸��� ��簡 �����Ѵ�.");
		System.out.println("=======================================================");
		nuk.attack();
		System.out.println();

	
	}
}

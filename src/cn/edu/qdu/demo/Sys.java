package cn.edu.qdu.demo;

import java.util.Scanner;

public class Sys {
	Moto[] motos;//���������ų���
	public void rentMoto() {
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = { 16, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("����������:");
		int day = input.nextInt();
		System.out.println("���⼸����");
		int count = input.nextInt();
		motos=new Moto[count];
		for (int i = 0; i < motos.length; i++) {

			System.out.println("��ѡ���" + (i + 1) + "����");
			System.out.println("1,�γ�  2,�ͳ�");
			int sel = input.nextInt();
			if (sel == 1) {
				System.out.println(" 1,����  2,����  3,�µ�");
				sel = input.nextInt();
				motos[i] = new Car("³B22222", carType[sel - 1]);// �����вι��캯��
																	// ����Car�����вι��캯��
				// Car car=new Car("³B22222");
				// moto.setType(carType[sel-1]);
				// �������
				//double totalFee = moto.rentFee(day);
				//System.out.println("��ѡ��" + carType[sel - 1] + "����" + day + "��  ����" + totalFee + "Ԫ");
			} else {
				System.out.println("seatCount 1,16 2,32");
				sel = input.nextInt();
				motos[i] = new Bus("³B11111", busType[sel - 1]);
				// bus.setSeatCount(busType[sel-1]);
				// �������
				//double totalFee = moto.rentFee(day);
				//System.out.println("��ѡ��" + busType[sel - 1] + "����" + day + "��  ����" + totalFee + "Ԫ");
			}
		}calcFee(day) ;
	}
	public void calcFee(int day) {
		double calcFee=0;
		for (int i = 0; i < motos.length; i++) {
			double fee =motos[i].rentFee(day);
			calcFee+=fee;
			if (motos[i] instanceof Car) {//instanceof�����ж�car��bus
			System.out.println("car" + "����" + day + "��  ����" + fee + "Ԫ");
		}else{
			System.out.println("bus" + "����" + day + "��  ����" + fee + "Ԫ");
			
		}
			}
		System.out.println("����"+calcFee);
	}

	public static void main(String[] args) {
		Sys s = new Sys();
		s.rentMoto();
	}
}

package cn.edu.qdu.demo;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType={"����","����","�µ�"};
		int[] busType={16,32};
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("day");
		int day = input.nextInt();
		System.out.println("1,car or 2,bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type 1,bmw 2,audi 3,benc");
			Car car=new Car("123");//�����вι��캯��  ����Car�����вι��캯��
			car.setType(carType[sel-1]);
			// �������
            double totalFee=car.rentFee(day);
		} else {
			System.out.println("seatCount 1,<16 2,>16");
			sel = input.nextInt();
			Bus bus=new Bus("423");
			bus.setSeatCount(busType[sel-1]);
			// �������
            double totalFee=bus.rentFee(day);
		}
	}
}

package cn.edu.qdu.demo;

import java.util.Scanner;

public class Sys {
	Moto[] motos;//声明数组存放车辆
	public void rentMoto() {
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = { 16, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("请输入天数:");
		int day = input.nextInt();
		System.out.println("共租几辆车");
		int count = input.nextInt();
		motos=new Moto[count];
		for (int i = 0; i < motos.length; i++) {

			System.out.println("请选择第" + (i + 1) + "辆车");
			System.out.println("1,轿车  2,客车");
			int sel = input.nextInt();
			if (sel == 1) {
				System.out.println(" 1,宝马  2,奔驰  3,奥迪");
				sel = input.nextInt();
				motos[i] = new Car("鲁B22222", carType[sel - 1]);// 父类有参构造函数
																	// 子类Car调用有参构造函数
				// Car car=new Car("鲁B22222");
				// moto.setType(carType[sel-1]);
				// 计算租金
				//double totalFee = moto.rentFee(day);
				//System.out.println("已选择" + carType[sel - 1] + "共租" + day + "天  共需" + totalFee + "元");
			} else {
				System.out.println("seatCount 1,16 2,32");
				sel = input.nextInt();
				motos[i] = new Bus("鲁B11111", busType[sel - 1]);
				// bus.setSeatCount(busType[sel-1]);
				// 计算租金
				//double totalFee = moto.rentFee(day);
				//System.out.println("已选择" + busType[sel - 1] + "共租" + day + "天  共需" + totalFee + "元");
			}
		}calcFee(day) ;
	}
	public void calcFee(int day) {
		double calcFee=0;
		for (int i = 0; i < motos.length; i++) {
			double fee =motos[i].rentFee(day);
			calcFee+=fee;
			if (motos[i] instanceof Car) {//instanceof函数判断car或bus
			System.out.println("car" + "共租" + day + "天  共需" + fee + "元");
		}else{
			System.out.println("bus" + "共租" + day + "天  共需" + fee + "元");
			
		}
			}
		System.out.println("共计"+calcFee);
	}

	public static void main(String[] args) {
		Sys s = new Sys();
		s.rentMoto();
	}
}

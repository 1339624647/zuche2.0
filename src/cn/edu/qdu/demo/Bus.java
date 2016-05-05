package cn.edu.qdu.demo;

public class Bus extends Moto {
	private int seatCount;

	public Bus(String MotoNo,int seatCount) {
		super(MotoNo);
		this.seatCount=seatCount;
	}

	public double rentFee(int day) {
		// type day
		if (seatCount >= 16) {
			setFee(2000);
		} else {
			setFee(1000);
		}
		return super.rentFee(day);// ����
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}

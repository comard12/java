class Time{
	private int time;
	private int minute;
	private int second;
	
	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	int gettime() {
		return time;
	}
	int getmin() {
		return minute;
	}
	int getsec() {
		return second;
	}
	void print() {
		System.out.println(time+"½Ã"+minute+"ºÐ"+second+"ÃÊ");
	}
}
class AlarmClock{
	private Time currentTime;
	private Time alarmTime;
	
	public AlarmClock(Time a,Time c) {
		alarmTime = a;
		currentTime = c;
		
	}
	boolean alarm() {
		if(currentTime.gettime()==alarmTime.gettime()&&currentTime.getmin() == alarmTime.getmin()&&currentTime.getsec()==alarmTime.getsec()) {
			System.out.println("¶Ñ·ç·ç ±Â¸ð´× ¶Ñ·ç·ç ±Â¸ð´× µûµûµûµûµû~");
			return true;
		}
			
		else
			return false;
	}
	void print() {
		System.out.print("ÇöÀç ½Ã°£:");
		currentTime.print();
		System.out.print("¾Ë¶÷ ½Ã°£:");
		alarmTime.print();
	}
}
public class AlarmClockTest {
	public static void main(String args[]) {
		Time alarm = new Time(6,0,0);
		Time current = new Time (7,0,0);
		AlarmClock c = new AlarmClock(alarm,current);
		c.print();
		System.out.println(c.alarm());
	}
}

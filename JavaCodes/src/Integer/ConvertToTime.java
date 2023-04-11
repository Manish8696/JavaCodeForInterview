package Integer;

public class ConvertToTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time = 3600;
int second = time%60;
int hour = time/60;
int min = hour%60;
hour = hour/60;
System.out.println(hour+":"+min+":"+second);
	}

}

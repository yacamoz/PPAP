package toString;
class studentinfo {
	public int grade;
	studentinfo(int grade){
		this.grade=grade;
	}
}
class employeeinfo {
	public int rank;
	employeeinfo(int rank){
		this.rank=rank;
	}
}
class employeeperson {
		public employeeinfo info;
		employeeperson(employeeinfo info){
			this.info=info;
		}
}
class person<T, S> {
	public T info;
	public S id;
	person(T info, S id){
		this.info = info;
		this.id = id;
	}
}

public class generics {

	public static void main(String[] args) {
		//double->Double etc.
		Integer id = new Integer(1);
		person<employeeinfo, Integer> p1 = new person<employeeinfo, Integer>(new employeeinfo(1),id);
		System.out.println(p1.id.intValue()); //intValue는 래퍼클래스의 인트타입으로 변환한 값을 제공
	}
}
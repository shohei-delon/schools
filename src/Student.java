
public class Student {
	/*生徒名を格納する*/
	String name;
	/*国語の点数を格納する*/
	int kokugo;
	/*算数の点数を格納する*/
	int sansu;

	public Student(){

	}

	public Student(String name){
		this.name = name;
		this.kokugo = 0;
		this.sansu = 0;
	}

	public Student(String name,int kokugo, int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
	}

	String getName(){
		return name;
	}

	int getKokugo(){
		return kokugo;
	}

	int getSansu(){
		return sansu;
	}

	void setName(String n){
		this.name = n;
	}

	void setKokugo(int k){
		this.kokugo = k;
	}

	void setSansu(int s){
		this.sansu = s;
	}

	void show(){
		System.out.println("氏名："+name);
		System.out.println("国語：" + kokugo);
		System.out.println("算数：" + sansu);
	}
}

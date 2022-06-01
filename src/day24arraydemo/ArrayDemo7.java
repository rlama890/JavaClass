package day24arraydemo;

public class ArrayDemo7 {

	public static void main(String[] args) {
		String[][] nameList = { { "ram", "shyam", "krishna" },{ "hari", "gopal", "madhav"},{ "sita", "radha", "gita" }  };
		
		for (int i = 0; i < nameList.length; i++) {
			for (int j = 0; j < nameList.length; j++) {
				System.out.print(nameList[i][j] + " ");		
			}
			System.out.println();
		}
	}

}

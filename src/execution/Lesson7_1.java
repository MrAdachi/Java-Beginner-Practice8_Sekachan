package execution;

public class Lesson7_1 {

	public static void main(String[] args) {
		String[] names = {"桜井", "田原", "中川", "鈴木"};
		String search = args[0];
		boolean result = false; // 検索結果を格納
		
		for(int i = 0; i < names.length; i++) {
			if(args[0].equals(names[i])) {
				result = true;
			}
		}
		
		if(result) {
			System.out.println(search + "さんは含まれています");
		} else {
			System.out.println(search + "さんは含まれていません");
		}
	}
}

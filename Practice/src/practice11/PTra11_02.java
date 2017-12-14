package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します


		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		Book[] books = FileReaderClass.readBookDataFile();

		String input = new java.util.Scanner(System.in).nextLine();

		for(int i = 0; i < books.length; i++) {

			if(books[i].title.indexOf(input) != -1) {
				System.out.println(books[i].dispBookInfo());
			}

		}



	}
}


//public class FileReaderClass {
//
//	private FileReaderClass() {
//		/* インスタンス化を禁止 */
//	}
//
//	/**
//	 * bookData.csvを読み込み、Bookの配列として取得します。
//	 * @return	bookDataの内容をBookインスタンスの配列として変換した形
//	 */
//	public static Book[] readBookDataFile() {
//		String[] fileRow = new String[65536];	/* とりあえずたくさん確保：List<String>を使いたい */
//		Book[] bookList = null;				/* 初期値：List<Book>を使いたい */
//		int index = 0;
//
//		try(Scanner scanner = new Scanner(new File("csv/bookData.csv"))) {
//			while(scanner.hasNext()) {
//				fileRow[index] = scanner.nextLine();
//				index++;
//			}
//
//			bookList = new Book[index];
//			for (int i = 0; i < index; i++) {
//				String[] rowArray = fileRow[i].split(",");
//				bookList[i] = new Book(
//								 rowArray[0]	// 本のタイトル
//								,rowArray[1]	// 著者
//								,Integer.parseInt(rowArray[2])	// 定価
//								,Integer.parseInt(rowArray[3])	// ページ数
//								,rowArray[4]	// 出版社
//							);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("ファイルが見つかりませんでした");
//		} catch (Exception e) {
//			System.out.println("エラーが発生しました");
//		}
//
//		return bookList;
//	}
//}

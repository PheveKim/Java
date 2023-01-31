package day0131.test04;

import java.util.*;
import java.io.*;
import java.lang.*;


public class Test1 {
	public static void main(String[] args) throws IOException {
		// Scanner vs. BufferedReader
		// - big_input.txt에서 한줄씩 읽어와서
		// - 정수형으로 바꾸기

		// FileReader & FileWriter
		test1("    FileReader & FileWriter    ");

		// BufferedReader & BufferedWriter
		test2("BufferedReader & BufferedWriter");
	}

	public static void test1(String testname) throws IOException {

		try (Scanner sc = new Scanner(new FileInputStream("bit_input.txt"))) {

			long start = System.nanoTime();
			while (sc.hasNext()) {
				int num = sc.nextInt();
			}
			long end = System.nanoTime();

		}

	}

	public static void test2(String testname) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("big_input.txt")))) {
			// 표준입출력 -> 알고리즘 ->
			// System.in <= InputStream
			// System.out <= OutputStream
			// ex) 키보드에서 입력 받을 때
			// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// cf)
			// Scanner sc = new Scanner(System.in));
			// BufferdInputStream in = new BufferdInputStream(new FileInputStream());
			long start = System.nanoTime();

			String l;
			while ((l = br.readLine()) != null) {
				int num = Integer.parseInt(l);
			}

			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end - start);
		}
	}

}

# [Silver V] 단어 정렬 - 1181 

[문제 링크](https://www.acmicpc.net/problem/1181) 

### 성능 요약

메모리: 26156 KB, 시간: 288 ms

### 분류

문자열, 정렬

### 제출 일자

2025년 5월 31일 23:07:29

### 문제 설명

<p>알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.</p>

<ol>
	<li>길이가 짧은 것부터</li>
	<li>길이가 같으면 사전 순으로</li>
</ol>

<p>단, 중복된 단어는 하나만 남기고 제거해야 한다.</p>

### 입력 

 <p>첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.</p>

### 출력 

 <p>조건에 따라 정렬하여 단어들을 출력한다.</p>


# 배운점

<p>Arrays.sort()는 배열을 오름차순으로 정렬해주는 것 뿐 아닌, 사용자에 의해 구현할 수 있다. 이 문제에서는 String 배열을
입력받으니 Comparator인터페이스에 String 타입을 넣고, compare 메서드를 오버라이딩 해준다. compare 메서드의 return type이 왜 int형이냐면, compare 메서드는 넘어온 매개변수를 보고 양의정수, 0, 음의정수의 3개의 리턴 값에 따라 위치를 바꿀지 결정하게 된다.
만약 {"abc", "ab", "abcd"} 라는 문자열 배열이 있고, s1.length()가 3이고, s2.length()가 2이고, return s1.lenngh() - s2.length()가 있다고 생각해보자. 그렇다면 3-2 이므로 양의정수가 return되고, 이는 s1이 s2보다 길다고 판단하여 s1과 s2의 위치가 바뀌게 된다. 그 다음
s2 - s3 은 음의 정수이므로 위치가 그대로 있게 된다. 그리고, 문자열의 길이가 같다면 즉 s1.length() == s2.lenth()라면 compareTo() 메서드를 이용하여 사전 순으로 정렬할 수 있다. ex) s1.compareTo(s2)</p>

<p>StringBuilder 예제) StringBuiler sb = new StringBuilder , String[] s = {"apple", "banana", "cherry", "banana"}, sb.append(s[0]).append("\n")라면 sb에는 apple\n이 되어있고, 이 문제대로 정리한다면, 사전 순 정렬이 위의 코드에 포함되어 있으므로, apple\ncherry\nbanana\n 이렇게 sb가 구성될 것이다. 그 후 System.out.println(sb)를 통해 sb를 출력한다면 \n를 기준으로 문자열이 출력되는 것을 확인할 수 있다. 만약 .append("\n")이 없다면 문자들은 applecherrybanana 이런식으로 붙어서 출력되게 된다.</p>

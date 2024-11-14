package org.example.jdbc2;

public class TestLombok {
    public static void main(String[] args) {
        // 1. 가방을 만들자 (ProductVO 객체 생성)
        ProductVO vo = new ProductVO();

        // 2. 가방에 데이터를 놓자 (setter를 통해 값 설정)
        vo.setNo(1);
        vo.setName("신발");
        vo.setContent(10);  // content에 값을 설정 (예: 10)
        vo.setPrice(50000);  // 가격도 설정 (예: 50000)

        // 3. 가방을 전달하자 (여기서는 생략)

        // 4. 가방에서 데이터 꺼내자 (getter를 통해 값 가져오기)
        int no = vo.getNo();
        String name = vo.getName();
        int content = vo.getContent();
        int price = vo.getPrice();

        // 출력
        System.out.println("번호: " + no);
        System.out.println("이름: " + name);
        System.out.println("내용: " + content);
        System.out.println("가격: " + price);

        // Lombok의 @ToString을 사용하여 객체 정보 출력
        System.out.println(vo.toString());
    }
}
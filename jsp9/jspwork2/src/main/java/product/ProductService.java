package product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Product를 관리할 클래스(DAO)
public class ProductService {
	//자료 구조(Data Structure - Collection)
	Map<String, Product> products = new HashMap<>();
	
	//생성자 - 상품 생성
	public ProductService() {
		Product p1 = new Product("p-11", "Galaxy21", "삼성전자",
				1000000, "2023-03-16");
		Product p2 = new Product("p-12", "Lg 그램", "LG전자",
				1500000, "2023-04-16");
		
		
		//회원 생성후 저장
		products.put("p-11", p1);
		products.put("p-12", p2);
	}
	
	//상품 목록 보기
	public List<Product> getProductList(){
		//values() - 키에 검색된 값임.
		return new ArrayList<>(products.values());
	}
	
	//상품 1개 보기(상세 보기)
	public Product getProduct(String pid) {
		return products.get(pid);
	}
}

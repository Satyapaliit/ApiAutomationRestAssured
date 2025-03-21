package reqres.in.pojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<User> data;
	private Support support;

}

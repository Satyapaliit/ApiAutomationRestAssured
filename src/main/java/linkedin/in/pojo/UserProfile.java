package linkedin.in.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
	private String id;
	private String urn;
	private String username;
	private String firstName;
	private String lastName;
	private boolean isPremium;
	private boolean isOpenToWork;
	private String profilePicture;
	private List<ProfilePictures> profilePictures;
	private String summary;
	private String headline;
	
	

}

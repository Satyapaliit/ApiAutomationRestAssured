package linkedin.in.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Geo {
	private String country;
	private String city;
	private String full;
	private String countryCode;

}

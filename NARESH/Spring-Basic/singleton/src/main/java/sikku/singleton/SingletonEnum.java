package sikku.singleton;

import lombok.Getter;
import lombok.Setter;

public enum SingletonEnum {
	INSTANCE;

	@Setter
	@Getter
	private String name;

}

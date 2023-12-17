package sikku.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonDemo implements Cloneable {
	private static final class SingletonFactory {
		private static final SingletonDemo INSTANCE;
		static {
			INSTANCE = new SingletonDemo();
		}
	}

	public static SingletonDemo getInstance() {
		return SingletonFactory.INSTANCE;
	}

	protected SingletonDemo readResolve() {
		return SingletonFactory.INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloning is not supported for this class");
	}
}

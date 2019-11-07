package test;

/**
 * 試す用の呼ばれる側
 * @author TSR15001PC
 *
 */
public class SampleClass {
	private String name;
	private String id;
	private String value;

	public int calcInfomation() throws ApplicationException {
		int id = 0;
		try {
			id = Integer.parseInt(this.id);
		} catch (NumberFormatException e) {
			throw new ApplicationException(e);
		}
		return id;
	}
	
	/**
	 * 名前を返す
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前を設定する
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * アカウントIDを返す
	 */
	public String getId() {
		return id;
	}
	/**
	 * アカウントIDを設定する
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 情報を返す
	 */
	public String getValue() {
		return value;
	}
	/**
	 * 情報を設定する
	 */
	public void setValue(String value) {
		this.value = value;
	}

}

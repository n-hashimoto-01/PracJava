package test;

/**
 * �����p�̌Ă΂�鑤
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
	 * ���O��Ԃ�
	 */
	public String getName() {
		return name;
	}
	/**
	 * ���O��ݒ肷��
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * �A�J�E���gID��Ԃ�
	 */
	public String getId() {
		return id;
	}
	/**
	 * �A�J�E���gID��ݒ肷��
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * ����Ԃ�
	 */
	public String getValue() {
		return value;
	}
	/**
	 * ����ݒ肷��
	 */
	public void setValue(String value) {
		this.value = value;
	}

}

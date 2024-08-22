package libraryManagement;

public class Member implements MemberInterface {
	private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		 return name;
	}

	@Override
	public String getMemberId() {
		// TODO Auto-generated method stub
		return memberId;
	}

}

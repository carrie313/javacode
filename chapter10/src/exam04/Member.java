package exam04;

public class Member {
	public String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	
}
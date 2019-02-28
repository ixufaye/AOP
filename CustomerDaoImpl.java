package cn.muc.spring.demo3;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		System.out.println("保存方法被调用了。。。");

	}

	@Override
	public String delete() {
		System.out.println("删除方法被调用了。。。");
		return "后置通知获得方法返回值";

	}

	@Override
	public void update() {
		System.out.println("更新方法被调用了。。。");

	}

	@Override
	public void find() {
		System.out.println("查找方法被调用了。。。");
		int a = 1 / 0;

	}

}

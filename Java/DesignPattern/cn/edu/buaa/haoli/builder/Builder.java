package cn.edu.buaa.haoli.builder;
/*������ģʽ�еĽ�������
 * ��һ������ӿڣ������в�ͬ�ľ���ʵ��
 *���������������췽������Ʒ�ɼ���������ɣ������߾��м����������췽��
 *���з��ز�Ʒ�ķ���
 * */
public interface Builder {
	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
}

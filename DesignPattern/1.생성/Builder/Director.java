public class Director {
    private Builder builder;
    public Director(Builder builder) {
    this.builder = builder;
    }

    public Object construct() {
        builder.makeTitle("Greeting");
        builder.makeString("��ħ�� ����");
        builder.makeItems(new String[]{"���� ��ħ�Դϴ�.", 
                                       "�ȳ��ϼ���", 
                                      });
        builder.makeString("�㿡");
        builder.makeItems(new String[]{"�ȳ��ϼ���",
                                       "�ȳ����ֹ�����",
                                       "�ȳ����輼��", 
                                      });
        return builder.getResult();
    }
}

import com.huaban.analysis.jieba.JiebaSegmenter;

public class test {

	public static void main(String[] args) {
		String str = "���Ǳ�����ҵ��ѧ��˶ʿ�о���";
		JiebaSegmenter js = new JiebaSegmenter();
		System.out.println(js.sentenceProcess(str));
	}

}

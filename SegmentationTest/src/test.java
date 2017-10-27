import com.huaban.analysis.jieba.JiebaSegmenter;

public class test {

	public static void main(String[] args) {
		String str = "我是北京工业大学的硕士研究生";
		JiebaSegmenter js = new JiebaSegmenter();
		System.out.println(js.sentenceProcess(str));
	}

}

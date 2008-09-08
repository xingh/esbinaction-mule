package esb.util.framework;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.thoughtworks.xstream.XStream;

public class JavaToXStreamTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object payload, String encoding)
			throws TransformerException {
		
		XStream stream = new XStream();
		return stream.toXML(payload);
	}
}

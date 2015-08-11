package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class CharacterFilter implements Filter {
	private String charSet = "GBK";
	private Log log = LogFactory.getLog(getClass());
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		//log.info(charSet);log.info(request.getCharacterEncoding());
		request.setCharacterEncoding(charSet);
		response.setCharacterEncoding(charSet);
		filterChain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String charSet = config.getInitParameter("charSet");
		if(charSet != null ){
			this.charSet = charSet;
		}
		log.info(charSet);
	}

}

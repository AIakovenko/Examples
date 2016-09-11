/**
 * 
 */
package examples.springgwt.client;

import com.google.gwt.user.client.ui.RootPanel;

public class ContentDispatcher {
	public static final String TAG_ID_HEADER = "header";
	public static final String TAG_ID_CONTENT = "content";
	public static final String TAG_ID_FOOTER = "footer";
	
	private Content content;
	private RootPanel rootPanel;
	
	public ContentDispatcher(Content content){
		this.content = content;
	}
	
	public void setContent(String htmlTagId){
	    rootPanel = RootPanel.get(htmlTagId);
	    rootPanel.clear();
	    rootPanel.add(content.getContent());
	
	}
	
	
	

}

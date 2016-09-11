/**
 * 
 */
package examples.springgwt.client;

import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.Container;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;

/**
 * Jul 4, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class FilterContent implements Content{
	
	@Override
	public Container getContent() {
		BorderLayoutContainer mainContainer = new BorderLayoutContainer();
		
		ContentPanel westPanel = new ContentPanel();
		westPanel.add(getLeftContent());
		
		BorderLayoutData westData = new BorderLayoutData(200);
		westData.setCollapsible(true);
		
		mainContainer.setWestWidget(westPanel, westData);

		
		return mainContainer;
	}
	
	private Container getLeftContent(){
		VBoxLayoutContainer container = new VBoxLayoutContainer();
		TextButton button = new TextButton("Create");
		container.add(button);
		
		return container;
	}

}

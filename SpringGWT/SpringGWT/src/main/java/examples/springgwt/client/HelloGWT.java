/**
 * 
 */
package examples.springgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Jun 13, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class HelloGWT implements EntryPoint{
	private GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	private TextBox nameTextBox = new TextBox();
	private Label greetingLabel = new Label("Hello, GWT!");

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(nameTextBox);
		RootPanel.get().add(greetingLabel);
		
		final AsyncCallback<String> callback = new AsyncCallback<String>(){
			
			@Override
			public void onFailure(Throwable caught){
				greetingLabel.setText("ERROR!");
			}
			
			@Override
			public void onSuccess(String result){
				greetingLabel.setText(result);
			}
		};
		
		nameTextBox.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				greetingService.greet(nameTextBox.getText(), callback);	
			}
		});
	}
	
	

}

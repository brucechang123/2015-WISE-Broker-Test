package nccu.cs.percomlab.mqtttest;

import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttSubscriberDemo {

	public static void main(String[] args) {
		String clientId = "subscriber";
		MemoryPersistence persistence = new MemoryPersistence();
		try {
			// connect
			MqttAsyncClient sampleClient = new MqttAsyncClient(
					"tcp://localhost:1883", clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			sampleClient.setCallback(new MqttListener());
			IMqttToken conToken = sampleClient.connect(connOpts);
			conToken.waitForCompletion();

			// subscribe
			String topicName = "testtopic";
			System.out.println("Subscribing to topic \"" + topicName
					+ "\" qos " + 0);
			IMqttToken subToken = sampleClient.subscribe(topicName, 0, null,
					null);
			subToken.waitForCompletion();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

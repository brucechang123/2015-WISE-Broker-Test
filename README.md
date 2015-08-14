WISE-Broker-Test
-----

這個Java專案包含兩個package

#### amqptest
(1)在裝了WISE-Broker(以下稱server)的電腦上執行Subscriber.java <br />
(2)在不同IP的電腦(可以同個區域網路，只要跟server不同台就好)上執行Publisher.java，記得修改Publisher.java中的IP，改成server的IP。 <br />
(3)檢查server是否有接收到(2)送出的訊息。 <br />

#### mqtttest
(1)server的電腦上執行MqttSubscriberDemo.java <br />
(2)在不同IP的電腦上執行MqttPublisherDemo.java，記得修改MqttPublisherDemo.java中的IP，改成server的IP。 <br />
(3)檢查server是否有接收到(2)送出的訊息。 <br />


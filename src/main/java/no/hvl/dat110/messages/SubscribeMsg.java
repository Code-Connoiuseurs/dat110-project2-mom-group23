package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String topic;
	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
    }

	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
	
	public String toString() {
		return "SubscribeMsg [User = " + getUser() + ", topic = " + topic + "]";
	}
}

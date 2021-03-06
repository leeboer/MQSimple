package activeMQ.springActiveMQ;


import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Destination textDestination;

    public void sendTextMessage(final String text){
        jmsTemplate.send(textDestination, new MessageCreator() {

            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(text);
            }
        });
    }

}
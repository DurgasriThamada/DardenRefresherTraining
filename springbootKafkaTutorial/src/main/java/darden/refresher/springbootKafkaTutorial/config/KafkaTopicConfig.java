package darden.refresher.springbootKafkaTutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String jsonTopicName;
    @Bean
    public NewTopic refresherTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }

    @Bean
    public NewTopic refresherJsonTopic(){
        return TopicBuilder.name(jsonTopicName)
                .build();
    }
}

package name.monkey.slackjavaclient.model;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by tina on 10/30/15.
 */
public class SlackChannelHistoryResponse {
  @Key
  public boolean ok;

  @Key
  public List<SlackMessage> messages;

  @Key("has_more")
  public boolean hasMore;
}

package LSP;

public class Whatsapp extends SocialMedia {
    // in this we can't say that whatsapp is purely replacable by social media, after all it is a Social Media Platform.
    @Override
    public void ChatWithFriend() {
        // perform action
    }

    @Override
    public void PublishPost(Object Post) {
        // not applicable
    }

    @Override
    public void SendPhotoAndVideo() {
        // perform action
    }

    @Override
    public void GroupVideoCall(String... users) {
        // perform action
    }
}

// to overcome this problem we have to use the interface.

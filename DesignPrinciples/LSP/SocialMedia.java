package LSP;
// in this we gonna know why we learn the liskov substitution principle
public abstract class SocialMedia {

    public abstract void ChatWithFriend();

    public abstract void PublishPost(Object Post);

    public abstract void SendPhotoAndVideo();

    public abstract void GroupVideoCall(String... users);

}

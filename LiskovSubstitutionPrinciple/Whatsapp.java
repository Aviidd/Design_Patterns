package LiskovSubstitutionPrinciple;

public class Whatsapp implements SocialMedia, VideoCallManager{
    @Override
    public void ChatWithFriend() {
        //perform some action
    }

    @Override
    public void SendPhotoAndVideo() {
        //perform some action
    }

    @Override
    public void GroupVideoCall(String... users) {
        //perform some action
    }
}

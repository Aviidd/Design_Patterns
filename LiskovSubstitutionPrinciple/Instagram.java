package LiskovSubstitutionPrinciple;

public class Instagram implements PostMediaManager, SocialMedia {
    @Override
    public void PublishPost(Object Post) {
        //perform some action
    }

    @Override
    public void ChatWithFriend() {
        //perform some action
    }

    @Override
    public void SendPhotoAndVideo() {
        //perform some action
    }
}

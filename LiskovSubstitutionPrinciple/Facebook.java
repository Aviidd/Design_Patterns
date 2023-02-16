package LiskovSubstitutionPrinciple;

public class Facebook implements SocialMedia, PostMediaManager{
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

package Programmer.zaman.now.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {
    // void login(String username, String password) {

    // } ERROR karena sudah final method
}

public class Duck {

	int numberOfFriends;
	String favoriteFoods;
	
	void Quack() {
		System.out.println("The Duck has quacked");
	}
	void Waddle() {
		System.out.println("The Duck has waddled");
	}
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFoods = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
}

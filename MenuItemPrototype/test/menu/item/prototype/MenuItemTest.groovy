package menu.item.prototype;
import static org.junit.Assert.*;
import org.junit.Test

class MenuItemTest {
	
	@Test
	void testMenuItemSetUp(){
		def sirloin = new MenuItem("name":"Sirloin Steak", 
								   "price":10, 
								   "recipe":"Throw it on the grill",
								   "picture":"filler for picture", 
								   "QR":"filler for QR")
		
		assert sirloin.name == "Sirloin Steak"
		assert sirloin.price == 10
		assert sirloin.recipe == "Throw it on the grill"
		assert sirloin.picture == "filler for picture"
		assert sirloin.QR == "filler for QR"
	}
	
	@Test 
	void testRecipeSetUpNonLists(){
		def sirloinrecipe = new Recipe( "name":"Succulent Sirloin Recipe", 
										"tools": [], 
										"ingredients":[], 
										"prepTime":15, 
										"preparationSteps": [])
		
		assert sirloinrecipe.name == "Succulent Sirloin Recipe"
		assert sirloinrecipe.prepTime == 15
	}
	
	@Test
	void testRecipeToolAddition(){
		def testRecipe = new Recipe("tools": [])
		testRecipe.addTool("rolling pin")
		assert testRecipe.tools.contains("rolling pin")
	}
}

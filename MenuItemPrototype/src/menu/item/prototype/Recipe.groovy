package menu.item.prototype

class Recipe {
	
	def name
	def tools = []
	def ingredients
	def prepTime
	def preparationSteps
	
	def String toString(){}
	
	def addTools(Collection newTools){
		tools = tools + newTools	
	}
}

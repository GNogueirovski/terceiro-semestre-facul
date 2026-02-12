import React from "react";
import { View, Text, TextInput, Button } from "react-native";

function Principal(){
    return (
    <View> 
        <Text>Pizzaria - Gestão do cardápio</Text>
            <Text>Sabor da Pizza: </Text>
            <TextInput/>
            <Text>Preço: </Text>
        <TextInput/>
        <Text>Ingredientes: </Text>
        <TextInput/>
        <Button title="Salvar"/>
    </View>
    
    ) 
}
export default Principal;
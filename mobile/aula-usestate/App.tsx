import { StatusBar } from "expo-status-bar";
import { useState } from "react";
import { StyleSheet, Text, TextInput, View } from "react-native";
import { Button } from "react-native";


const lista = []
export default function App() {
  const [fiap, setFiap] = useState(12);
  const [nome, setNome] = useState<string>("");
  const [telefone, setTelefone] = useState<string>("")
  const [email, setEmail] = useState<string>("")
  return (
    /*
    <View style={{flex: 1, justifyContent:'center'}}>
      <Text>{fiap}</Text>
      <Button title="+" onPress={()=>{
        setFiap(fiap + 1);
        console.log(fiap);
      }}/>
    </View>
    */
    <View style={{ flex: 1, justifyContent: "center" }}>
      <TextInput
        value={nome}
        placeholder="nome"
        style={styles.textInput}
        onChangeText={(nm) => {
          setNome(nm);
        }}
      />
      <TextInput 
      placeholder="telefone"
      style={styles.textInput}
        value={telefone}
        onChangeText={(tel) => {
          setTelefone(tel);
        }}
      />
      <TextInput
        placeholder="email"
        value={email}
        style={styles.textInput}
        onChangeText={setEmail}
      />
      <Button title="save" onPress={()=>{
      const obj = {nome: nome, telefone:telefone, email: email};
      lista.push(obj)
      setEmail("")
      setNome("")
      setEmail("")
      }}/>

      <Button title="Pesquisar" onPress={()=>{
        for (let contato of lista as any){
          if (contato.nome.includes(nome)) {
            setNome(nome)
            setEmail(email)
            setTelefone(telefone)
          }
        }

      }}
      
    </View>
  );
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  textInput:{
    backgroundColor:"lightblue"
  }
});

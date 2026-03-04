import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Switch, Text, View, Image, Button, ToastAndroid, Alert } from 'react-native';
import { TextInput } from 'react-native/types_generated/index';
import dog from './assets/fiapinho.jpg'

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Digite seu nome:</Text>
      <TextInput style={{backgroundColor: "lightblue", borderColor: "purple", borderWidth: 1}} placeholder="Nome Completo: "
      keyboardType="ascii-capable" numberOfLines={4} multiline={true}  />
      <Text>Contratado: </Text>
      <Switch value={false} thumbColor="red" trackColor={{false: "lightpink", true:"pink"}}/> 
      <Image source={{uri: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNUUZCJSRnvEx40Xwhr5_hUTDaXICvIhVfpg&s"}} width={300} height={400}/>
      <Image source={dog} width={200} height={300}/>
      <Button title="Lançar Alerta" onPress={()=>{
        Alert.alert("Informação", "Nome preenchido", [{text: "Ok"}]);
      }} />
      <Button title="Lançar Toast Android" 
       onPress={()=>{
        ToastAndroid.show("Digite o nome completo", 
                ToastAndroid.LONG)
        }}
      />
      <StatusBar style="auto" />

    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});

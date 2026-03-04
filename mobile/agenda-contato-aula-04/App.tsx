import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { TextInput } from 'react-native/types_generated/index';

interface Contato {
  nome: string;
  telefone: string;
  email: string;
  info: string;
  foto: string;
  ativo: boolean;
  tipo: string;
}


export default function App() {

  return (
    <View style={styles.container}>
    <TextInput style={{placeholder:"nome", backgroundColor:"red"}}/>
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
